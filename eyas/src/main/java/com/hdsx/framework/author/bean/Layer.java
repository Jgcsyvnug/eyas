package com.hdsx.framework.author.bean;
/**
 * 图层
 * @author xiongxt
 * @2015年3月15日
 */
public class Layer {
	//唯一标识
	private String id;
	//图层名称
	private String layerName;
	//数据集
	private String dataSet;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLayerName() {
		return layerName;
	}
	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}
	public String getDataSet() {
		return dataSet;
	}
	public void setDataSet(String dataSet) {
		this.dataSet = dataSet;
	}
	@Override
	public String toString() {
		return "Layer [id=" + id + ", layerName=" + layerName + ", dataSet="
				+ dataSet + "]";
	}
	
}
