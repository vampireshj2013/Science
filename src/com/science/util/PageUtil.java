package com.science.util;

public class PageUtil {
	private Integer pageSize = 10;// 页面大小
	private Integer recordCount = 0;// 总记录
	private Integer index = 0;// 索引
	private Integer currPage = 1;//当前页

	/**
	 * 总页数
	 * 
	 * @return
	 */
	public Integer getPageCount() {
		Integer size = this.recordCount / this.pageSize;
		Integer mod = recordCount % pageSize;
		if (mod != 0) {
			size++;
		}
		return this.recordCount == 0 ? 1 : size;
	}

	/**
	 * 是否有上一页
	 * 
	 * @return
	 */
	public boolean isHasPrevious() {
		if (this.currPage != 1) {
			return true;
		}
		return false;
	}

	/**
	 * 是否有下一页
	 * 
	 * @return
	 */
	public boolean isHasNext() {
		if (this.currPage != this.getPageCount()) {
			return true;
		}
		return false;
	}

	public Integer getNextIndex() {
		return this.currPage * this.pageSize;
	}

	public Integer getPreviousIndex() {
		return (this.currPage - 2) * this.pageSize;
	}

	/**
	 * 获取索引
	 * 
	 * @return
	 */
	public Integer getIndex() {
		return this.index;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	/**
	 * 获取当前页
	 * 
	 * @return
	 */
	public Integer getCurrPage() {
		Integer c = index / pageSize;
		if ((index + 1) % pageSize != 0) {
			c++;
		}
		return c == 0 ? 1 : c;
	}

	/**
	 * 获取最后一页的第一行的索引
	 * 
	 * @return
	 */
	public Integer getLastIndex() {
		return this.getPageCount()*this.pageSize;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

}
