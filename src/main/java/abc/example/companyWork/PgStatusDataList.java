package abc.example.companyWork;

import java.util.List;

public class PgStatusDataList {
	private List<PgStatusData> data;
	private String msg;
	private int ok;
	public List<PgStatusData> getData() {
		return data;
	}
	public void setData(List<PgStatusData> data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getOk() {
		return ok;
	}
	public void setOk(int ok) {
		this.ok = ok;
	}
}
