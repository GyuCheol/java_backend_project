package com.practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.practice.model.Asset;

public interface AssetMapper {
	
	@Select("SELECT * FROM assets WHERE id = #{id}")
	Asset selectAsset(int id);
	
	@Select("SELECT * "
			+ "FROM assets AS a "
			+ "INNER JOIN departmentlocations AS dl "
			+ "ON a.departmentLocationId = dl.id "
			+ "WHERE departmentId = #{departmentId}")
	List<Asset> selectAssetByDepartment(int departmentId);
	
}
