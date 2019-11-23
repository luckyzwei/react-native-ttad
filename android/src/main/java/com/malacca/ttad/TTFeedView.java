package com.malacca.ttad;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class TTFeedView extends TTadViewManager {

    @Override
    public @NonNull String getName() {
        return "RNTTFeedView";
    }

    @Override
    protected @NonNull TTadView createViewInstance(@NonNull ThemedReactContext context) {
        return new TTadView(context, TTadType.FEED);
    }

    // 使用预加载 uuid
    @ReactProp(name = "uuid")
    public void setUUID(TTadView view, String uuid) {
        view.setUUID(uuid);
    }

    // 如果是视频广告, 是否可以暂停
    @ReactProp(name = "canInterrupt")
    public void setCanInterrupt(TTadView view, boolean canInterrupt) {
        view.setCanInterrupt(canInterrupt);
    }

    // 使用原生的 dislike 弹层
    @ReactProp(name = "dislikeNative")
    public void setDislikeNative(TTadView view, boolean dislikeNative) {
        view.setDislikeNative(dislikeNative);
    }
}