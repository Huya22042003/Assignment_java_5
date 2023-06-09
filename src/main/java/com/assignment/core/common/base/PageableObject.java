package com.assignment.core.common.base;

import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author phongtt35
 */

@Getter
public class PageableObject<T> {

    private List<T> data;
    private long totalPages;
    private int currentPage;

    public PageableObject(Page<T> page) {
        this.data = page.getContent();
        this.totalPages = page.getTotalPages();
        this.currentPage = page.getNumber();
    }
}
