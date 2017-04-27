### LeafLoadView 一个酷炫的加载进进度
#### 之前看到了一个很炫的动态图,是一个加载的进度条
![图片](https://raw.githubusercontent.com/Ajian-studio/GALeafLoading/master/raw/leaf_loading_readme.gif)
#### 确实挺好看的,有一篇博客做了一个view,几乎一模一样的呈现了和动态图一样的效果
[链接看原文](https://github.com/Ajian-studio/GALeafLoading)
#### 原博客背景用的是一张黄色的图片作为背景.想要修改的话是不能修改的.在LeafLoadView,添加了背景的修改功能
#### 背景和边框都是由Android的view绘制出来的,添加了很多属性,可以自定义修改
#### 考入到工程就能使用
| 属性            | 功能   | 
| ------------------- | ---- |
|backgroundColor | 加载精度条的背景颜色|
|borderColor |边框的颜色|
|seekColor|进度条的颜色|
|circleLeftStyle|左边起始加载的时候是选择圆弧还是扇形(boolean值)|
|rotationSpeed|右边圆形图片的旋转数度(一圈的毫秒值)|
|borderWidth |边框的宽度|
|circleWidth|圆形的外边框宽度|
|circleColor|圆形的外边框颜色|
效果图如下
![1493335149523.mp4_1493336134.gif](http://upload-images.jianshu.io/upload_images/3001453-19145f646c5844c8.gif?imageMogr2/auto-orient/strip)
![S70427-11471776.jpg](http://upload-images.jianshu.io/upload_images/3001453-6d2d8291fa120f53.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) ![](http://upload-images.jianshu.io/upload_images/3001453-9431f1f5bf717da9.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) ![](http://upload-images.jianshu.io/upload_images/3001453-6fe04582ea517d2f.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#### 使用方法很简单
#### 布局如下
    <RelativeLayout
        android:layout_width="302dp"
        android:layout_gravity="center_horizontal"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp">
    <com.yk.leafloadview.LeafLoadView
        android:id="@+id/leafview"
        android:layout_width="300dp"
        android:layout_height="60dp"
        yk:backgroundColor="#fdf0c8"
        yk:borderColor="#fddd84"
        yk:seekColor="#fcc11d"
        yk:circleColor="#ffffff"
        yk:borderWidth="18"
        yk:circleWidth="8"
        yk:rotationSpeed="200"
        yk:circleLeftStyle="false"/>
    <ImageView
        android:id="@+id/fan_p"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        android:layout_marginRight="7dp"
        android:src="@drawable/fengshan" />
#### activity中
     mLeafLoadView = (LeafLoadView) findViewById(R.id.leafview);
     ImageView imageView= (ImageView) findViewById(R.id.fan_p);
     mLeafLoadView.setTotalProgress(totalPro);
     mHandler.sendEmptyMessageDelayed(1,0);
     
#### handler 里面的代码

     Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    progress = progress + 1;
                    mLeafLoadView.setPrograss(progress);
                    mHandler.sendEmptyMessageDelayed(1,800); //800ms发送一次
                    break;
                default:
                    break;
            }
        }
    }; 
     
     


