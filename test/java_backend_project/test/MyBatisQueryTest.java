package java_backend_project.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.practice.mapper.AssetMapper;
import com.practice.mapper.DepartmentMapper;
import com.practice.mapper.OrderMapper;
import com.practice.model.Asset;
import com.practice.model.EMOrderAmount;

public class MyBatisQueryTest {
	
	private static SqlSessionFactory sqlSessionFactory;  
	
	@BeforeAll
	public static void setUp() throws Exception {
		
		String resource = "com/practice/config/mybatis-config.xml";
		
		try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			// SQL È®ÀÎ¿ë
			org.apache.ibatis.logging.LogFactory.useLog4JLogging();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	void test_to_load_assets_by_departmentId() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			AssetMapper mapper = session.getMapper(AssetMapper.class);
			
			List<Asset> assets = mapper.selectAssetByDepartment(1);
			
			assertEquals(mapper.selectAssetByDepartment(0).size(), 0);
			assertEquals(mapper.selectAssetByDepartment(1).size(), 1);
			
			assertEquals(assets.get(0).getId(), 3);
		}
	}
	
	@Test
	void test_to_load_assets_by_departmentId2() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			AssetMapper mapper = session.getMapper(AssetMapper.class);
			
			List<Asset> assets = mapper.selectAssetByDepartment(1);
			
			assertEquals(mapper.selectAssetByDepartment(0).size(), 0);
			assertEquals(mapper.selectAssetByDepartment(1).size(), 1);
			
			assertEquals(assets.get(0).getId(), 3);
		}
	}
	
	@Test
	void test_order_price() {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			
			List<EMOrderAmount> list = mapper.getEMOrderAmountListByDepartment(1, LocalDate.MIN, LocalDate.now());
			
			
			assertEquals(list.size(), 10);
			assertEquals(list.get(0).getYear(), 2017);
			assertEquals(list.get(0).getMonth(), 1);
			assertEquals(list.get(0).getAmount().compareTo(new BigDecimal(16380)), 0);
		}
	}

}
