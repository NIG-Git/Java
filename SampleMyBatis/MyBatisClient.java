package sysblo.exec;

import java.text.SimpleDateFormat;

import sysblo.entity.CustomerInfoTbl;
import sysblo.logic.MyBatisLogic;

public class MyBatisClient {

	public static void main(String[] args) {

		MyBatisLogic logic = new MyBatisLogic();

		CustomerInfoTbl tbl = logic.execute();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		System.out.println("口座番号 : " + tbl.getAccountNum());
		System.out.println("口座名義 : " + tbl.getCustomerName());
		System.out.println("支店コード : " + tbl.getBranchCode());
		System.out.println("口座開始日 : " + format.format(tbl.getStartDate()));
		System.out.println("備考 : " + tbl.getMemo());
		System.out.println("最終更新時刻 : " + format.format(tbl.getLatestUpdate()));

	}

}
