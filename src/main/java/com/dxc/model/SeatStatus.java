package com.dxc.model;

public class SeatStatus {
	int seat_no;
	String s_status;
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public String getS_status() {
		return s_status;
	}
	public void setS_status(String s_status) {
		this.s_status = s_status;
	}
	public SeatStatus(int seat_no, String s_status) {
		super();
		this.seat_no = seat_no;
		this.s_status = s_status;
	}
	public SeatStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SeatStatus [seat_no=" + seat_no + ", s_status=" + s_status + "]";
	}
	public int view_status(int status) {
		if(status==1)
			return 1;
		else 
			return 0;
	}
	

}
