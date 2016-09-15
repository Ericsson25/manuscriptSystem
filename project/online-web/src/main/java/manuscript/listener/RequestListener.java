package manuscript.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.err.println("KÉRÉS MENT");

	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.err.println("KÉRÉS JÖTT");

	}

}
