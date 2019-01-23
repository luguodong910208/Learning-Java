package p20190122;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class CustomThreadFactoryBuilder {
	private String namePrefix = null;
	private boolean daemon = false;
	private int priority = Thread.NORM_PRIORITY;
	
	public CustomThreadFactoryBuilder setDaemon(boolean daemon) {
		this.daemon = daemon;
		return this;
	}
	
	public CustomThreadFactoryBuilder setNamePrefix(String namePrefix) {
		if(namePrefix == null) {
			throw new NullPointerException();
		}
		this.namePrefix = namePrefix;
		return this;
	}
	
	public CustomThreadFactoryBuilder setPriority(int priority) {
		if(priority < Thread.MIN_PRIORITY) {
			throw new IllegalArgumentException(String.format("Thread priority (%s) must be >= %s", priority, Thread.MIN_PRIORITY));
		}
		if(priority > Thread.MAX_PRIORITY) {
			throw new IllegalArgumentException(String.format("Thread priority (%s) must be <= %s", priority, Thread.MAX_PRIORITY));
		}
		this.priority = priority;
		return this;
	}
	
	public ThreadFactory build() {
		return build(this);
	}
	
	private static ThreadFactory build(CustomThreadFactoryBuilder builder) {
		final String namePrefix = builder.namePrefix;
		final boolean daemon = builder.daemon;
		final Integer priority = builder.priority;
		final AtomicLong count = new AtomicLong(0);
		
		return new ThreadFactory() {
			@Override
			public Thread newThread(Runnable runnable) {
				Thread thread = new Thread(runnable);
				if(namePrefix != null) {
					thread.setName(namePrefix + "-" + count.getAndIncrement());
				}
				if(daemon == true) {
					thread.setDaemon(daemon);
				}
				if(priority != null) {
					thread.setPriority(priority);
				}
				return thread;
			}
		};
	}
}
