package com.liu.zhibao.angrypandamediaplayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import org.jetbrains.annotations.Nullable;

/**
 * Created by zhibao.Liu on 2018/8/15.
 *
 * @version :
 * @date : 2018/8/15
 * @des : 创建一个MediaPlayer播放器
 * @see{@link}
 */

public class MediaPlayerService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
