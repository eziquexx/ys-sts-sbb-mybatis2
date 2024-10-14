package com.mysite.sbbmybatis.dto;

import java.util.List;

public class PageDTO {
	private int page;				// 현재 페이지
	private int size;				// 현재 페이지의 개수
	private int totalPages;			// 페이지 총 갯수
	private long totalElements;		// 목록 총 갯수
	private List<Message> content; 	// 화면에 보일 목록 갯수
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public List<Message> getContent() {
		return content;
	}
	public void setContent(List<Message> content) {
		this.content = content;
	}
	
	// 생성자 함수
	public PageDTO(int page, int size, int totalPages, long totalElements, List<Message> content) {
		super();
		this.page = page;
		this.size = size;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.content = content;
	}
	
}
