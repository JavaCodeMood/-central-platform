package com.central.model.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SysMenu implements Serializable {

	private static final long serialVersionUID = 749360940290141180L;

	private Long id;
	private Long parentId;
	private String name;
	private String css;
	private String url;
	private String path;
	private Integer sort;
	private Date createTime;
	private Date updateTime;

	private Long pId;

	private List<SysMenu> child;
}
