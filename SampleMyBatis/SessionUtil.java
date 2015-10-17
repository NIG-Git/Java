package sysblo.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {

	private static final String SESSION_RESOURCE = "mybatis-config.xml";

	public static SqlSession createSessino() {

		SqlSession session = null;

		/*** 1 ***/
		/*** SQLセッションを取得 ***/
		try {
			InputStream is = Resources.getResourceAsStream(SESSION_RESOURCE);

			// InputStreamを引数にFactoryを取得
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

			// オートコミット機能なしでセッション取得
			session = ssf.openSession(false);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return session;

	}
}
