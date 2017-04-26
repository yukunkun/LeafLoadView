### LeafLoadView 一个酷炫的加载精进度
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
![](http://upload-images.jianshu.io/upload_images/3001453-9142e26f1c1a0f15.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](http://upload-images.jianshu.io/upload_images/3001453-a4dbc73687adb96c.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](http://upload-images.jianshu.io/upload_images/3001453-696e875ef57d8980.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
