package chapter8.chapter8_4;
import java.util.List;
import java.util.ArrayList;
public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("������JAVA EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���ANDROID����"));
		books.add(new String("���IOS����"));
		books.sort((o1, o2) -> (((String)o1).length()-((String)o2).length()));
		System.out.println(books);
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}

}
