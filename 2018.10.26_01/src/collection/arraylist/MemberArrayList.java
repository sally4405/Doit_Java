package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
/*	
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()) {
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		else arrayList.set(index, member);
	}
*/
	
	public void insertMember(Member member, int position) {
		if(position <1 || position > arrayList.size()+1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		arrayList.add(position-1, member);
	}
}
