package com.tandong.sademo.eventbus;

import android.os.Bundle;
import android.view.View;

import com.tandong.sa.activity.SmartActivity;
import com.tandong.sa.eventbus.EventBus;

public class EventBusActivity extends SmartActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		// 绫讳技浜庡箍鎾紝鍦ㄩ渶瑕佹帴鏀跺唴瀹圭殑鍦版柟娉ㄥ唽EventBus锛堟湁澶氱娉ㄥ唽鏂瑰紡锛岃繖閲屽彧灞曠ず鍏朵腑鍑犵锛?
		// 娉ㄥ唽锛氫笁涓弬鏁板垎鍒槸锛屾秷鎭闃呰?锛堟帴鏀惰?锛夛紝鎺ユ敹鏂规硶鍚嶏紝浜嬩欢绫?
		EventBus.getDefault().register(this);
//		EventBus.getDefault().register(this, "setTextA", SetTextAEvent.class);
//		EventBus.getDefault().register(this, "setTextB", SetTextBEvent.class);
//		EventBus.getDefault().register(this,"messageFromSecondActivity",SecondActivityEvent.class);
//		EventBus.getDefault().registerSticky(this, "messageFromSecondActivity", SecondActivityEvent.class);
//		EventBus.getDefault().register(this, "countDown", CountDownEvent.class);
	}

	public void postEvent(View view) {
		// 鍒嗗彂锛堝湪浣犻渶瑕佸彂閫佸唴瀹规秷鎭殑鍦版柟浣跨敤璋冪敤鍗冲彲锛?
		EventBus.getDefault().post("SmartAndroid");
		// EventBus.getDefault().post(new MyEvent());

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		EventBus.getDefault().unregister(this);
	}

	// 浠ヤ笅灞曠ず鍏朵腑4绉嶆帴鏀跺鐞嗕簨浠跺唴瀹圭殑鏂规硶锛屾柟娉曞悕绉板浐瀹?
	public void onEventMainThread(String json) {// 鎺ユ敹浜嬩欢鍐呭鍦版柟锛堝弬鏁扮被鍨嬪彲浠ヨ嚜宸辨牴鎹疄闄呮儏鍐靛畾涔夛級

	}

	public void onEvent(Object obj) {// 榛樿鎺ユ敹浜嬩欢鍐呭鍦版柟锛堝弬鏁扮被鍨嬪彲浠ヨ嚜宸辨牴鎹疄闄呮儏鍐靛畾涔夛級

	}

	public void onEventAsync(Object event) {// 鎺ユ敹浜嬩欢鍐呭鍦版柟锛堝弬鏁扮被鍨嬪彲浠ヨ嚜宸辨牴鎹疄闄呮儏鍐靛畾涔夛級

	}

	public void onEventBackgroundThread(Object event) {// 鎺ユ敹浜嬩欢鍐呭鍦版柟锛堝弬鏁扮被鍨嬪彲浠ヨ嚜宸辨牴鎹疄闄呮儏鍐靛畾涔夛級

	}
}
