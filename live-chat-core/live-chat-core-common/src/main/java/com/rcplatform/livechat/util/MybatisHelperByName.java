package com.rcplatform.livechat.util;


import com.rcplatform.livechat.mybatis.mapper.CommonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.io.IOException;
import java.io.Reader;

/**
  * 采用Effiective java 推荐的静态内部类方法实现单例
 */
public class MybatisHelperByName {

	/**
	 * mybatis sqlSessionFactory 对象 需要手动关闭session
	 */
	private SqlSessionFactory sqlSessionFactory = null;

	/**
	 * sqlSessionManager
	 */
	private SqlSessionManager sqlSessionManager = null;


	/*private static class MybatisHelperInstance {
		private static final MybatisHelperByName mybatisHelper = new MybatisHelperByName(null);
	}
*/
	/**
	 * 初始化mapbatisHelper
	 */
	private MybatisHelperByName(String name) {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("configuration.xml");
			this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,name);
			this.sqlSessionManager = SqlSessionManager.newInstance(sqlSessionFactory);
			registerMapper(sqlSessionFactory.getConfiguration());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 注册公用mapper
	 * @param configuration
     */
	private  void registerMapper(Configuration configuration){
		MapperHelper mapperHelper = new MapperHelper();
		Config config = new Config();
		mapperHelper.setConfig(config);
		mapperHelper.registerMapper(CommonMapper.class);
		mapperHelper.processConfiguration(configuration);
	}

	/**
	 * 获取mybatisHelper 单例对象
	 * *
	 * @param name 
	 * @return 对象实例
	 */
	public static  MybatisHelperByName getInstance(String name) {
		//return  MybatisHelperInstance.mybatisHelper;
		return new MybatisHelperByName(name);
	}





	/**
	 * 获取sessionFactory
	 * @return the sessionFactory
	 */
	public SqlSessionFactory getSessionFactory() {
		return sqlSessionFactory;
	}


    /**
	 * 获取sqlSessionManager对象
	 * @return
	 */
	public  SqlSessionManager getSqlSessionManager(){
		return sqlSessionManager ;
	}


	/**
	  获取 mapper 对象
	 * @param c class
	 * @param <T> 对象
     * @return
     */
	public <T> T getMapper (Class<T> c){
		return getSqlSessionManager().getMapper(c);
	}




}
