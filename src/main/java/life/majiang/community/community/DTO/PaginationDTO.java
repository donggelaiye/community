package life.majiang.community.community.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * description:前端问题展示和分页数据DTO
 * author:dong.chen
 * Date:2019/9/2610:50
 **/
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer currentPage;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer currentPage, Integer pageSize) {
        totalPage = (totalCount % pageSize) == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        if (currentPage < 1) {
            currentPage = 1;
        }
        if (currentPage > totalPage) {
            currentPage = totalPage;
        }
        this.currentPage = currentPage;
        //pages中加入页码显示
        pages.add(currentPage);
        for (int i = 1; i < 4; i++) {
            if (currentPage - i > 0) {
                pages.add(0, currentPage - i);
            }
            if (currentPage + i <= totalPage) {
                pages.add(currentPage + i);
            }
        }
        //是否显示上一页
        showPrevious = (currentPage == 1) ? false : true;
        //是否显示下一页
        showNext = (currentPage == totalPage) ? false : true;
        //是否显示首页
        showFirstPage = pages.contains(1) ? false : true;
        //是否显示尾页
        showEndPage = pages.contains(totalPage) ? false : true;
    }
}
