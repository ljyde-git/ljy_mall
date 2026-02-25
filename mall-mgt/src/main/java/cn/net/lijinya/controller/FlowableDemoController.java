package cn.net.lijinya.controller;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/flowable/demo")
public class FlowableDemoController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @PostMapping("/start")
    public Map<String, Object> start(@RequestParam(required = false) String businessKey,
                                     @RequestParam(required = false, defaultValue = "demoUser") String assignee) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("assignee", assignee);

        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("demoApproval", businessKey, variables);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("processInstanceId", processInstance.getId());
        result.put("processDefinitionId", processInstance.getProcessDefinitionId());
        result.put("businessKey", processInstance.getBusinessKey());
        return result;
    }

    @GetMapping("/tasks")
    public List<Map<String, Object>> tasks(@RequestParam(required = false) String assignee) {
        List<Task> tasks = StringUtils.hasText(assignee)
                ? taskService.createTaskQuery().taskAssignee(assignee).orderByTaskCreateTime().desc().list()
                : taskService.createTaskQuery().orderByTaskCreateTime().desc().list();

        List<Map<String, Object>> result = new ArrayList<>(tasks.size());
        for (Task task : tasks) {
            Map<String, Object> item = new LinkedHashMap<>();
            item.put("taskId", task.getId());
            item.put("name", task.getName());
            item.put("assignee", task.getAssignee());
            item.put("createTime", task.getCreateTime());
            item.put("processInstanceId", task.getProcessInstanceId());
            item.put("processDefinitionId", task.getProcessDefinitionId());
            result.add(item);
        }
        return result;
    }

    @PostMapping("/tasks/{taskId}/complete")
    public Map<String, Object> complete(@PathVariable String taskId, @RequestBody(required = false) Map<String, Object> variables) {
        if (variables == null) {
            variables = new HashMap<>();
        }
        taskService.complete(taskId, variables);

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("taskId", taskId);
        result.put("completed", true);
        return result;
    }
}

