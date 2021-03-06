package p20190122;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {

	public static void main(String[] args) {
		// 获取Java线程管理MXBean
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// 获取线程和线程堆栈信息
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		// 遍历线程线程，仅打印线程ID和线程名称信息
		for(ThreadInfo threadInfo : threadInfos) {
			System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
		}
	}
}
