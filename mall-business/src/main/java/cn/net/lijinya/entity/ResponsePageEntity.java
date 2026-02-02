package cn.net.lijinya.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePageEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer pageNo = 1;
    private Integer pageSize = 10;
    private Long totalCount = 0L;
    private Integer totalPages = 0;
    private List<T> data = Collections.emptyList();

    /**
     * 构建空结果
     */
    public static <T> ResponsePageEntity<T> buildEmpty(Object condition) {
        ResponsePageEntity<T> result = new ResponsePageEntity<>();
        if (condition instanceof RequestPageEntity) {
            RequestPageEntity pageEntity = (RequestPageEntity) condition;
            result.setPageNo(pageEntity.getPageNo());
            result.setPageSize(pageEntity.getPageSize());
        } else {
            result.setPageNo(1);
            result.setPageSize(10);
        }
        result.setTotalCount(0L);
        result.setTotalPages(0);
        result.setData(Collections.emptyList());
        return result;
    }

    /**
     * 构建结果
     */
    public static <T> ResponsePageEntity<T> build(Object condition, int count, List<T> data) {
        ResponsePageEntity<T> result = new ResponsePageEntity<>();
        if (condition instanceof RequestPageEntity) {
            RequestPageEntity pageEntity = (RequestPageEntity) condition;
            result.setPageNo(pageEntity.getPageNo());
            result.setPageSize(pageEntity.getPageSize());
        } else {
            result.setPageNo(1);
            result.setPageSize(10);
        }
        result.setTotalCount((long) count);
        result.setTotalPages((int) Math.ceil(count * 1.0 / result.getPageSize()));
        result.setData(data != null ? data : Collections.emptyList());
        return result;
    }
}