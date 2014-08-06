package test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import sun.misc.Unsafe;

public class Test<T> extends AbstractTest {
	private T value;
	private int fucker;
	public Test(){
		System.out.println("test");
	}
	public void setValue(T value){
		this.value = value;
	}
	public T getValue(){
		return this.value;
	}
	public <E> Map<T, E> getMap(){
		return new HashMap<T,E>();
	}
	
	public static void main(String [] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException{
		new Thread(()->{System.out.println("hello world");}).start();
	}
	@Override
    public void fuck() {
	    // TODO Auto-generated method stub
	    System.out.println("fuck");
    }
}
