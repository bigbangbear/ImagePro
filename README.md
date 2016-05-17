# ImagePro
#### Image

> 图像模块：选择图像、拍照、裁剪图像

* 包括两个模块 ：UGallery 与 UCrop
* UCrop：图像裁剪库
  * https://github.com/Yalantis/uCrop.git
  * 由于gradle:1.5.0不支持vectorDrawables.useSupportLibrary，所以只能直接导入模块，注释相关代码。然后，让UGallery依赖该模块（默认方式）。
  * 如果gradle:2.0.0以上，可以在UGallery通过Gradle引入该库。
    * *compile 'com.yalantis:ucrop:1.5.0'*



#### 使用

1. 导入模块，默认导入UGallery与UCrop两个库

2. 接口核心类**UGallery**

   1. 发起请求，例如拍照

      ```java
      UGallery.selectSingleImage(context);
      ```

   2. 数据返回  *onActivityResult()*

   3. 从intent中获取数据

      * 单张图像： *UGallery.getSingleImage(intent)*
      * 多张图像： *UGallery.getMutilImage(intent)*

      ```java
      @Override
      protected void onActivityResult(int requestCode, int resultCode, Intent data) {
          super.onActivityResult(requestCode, resultCode, data);
          if (resultCode == RESULT_OK && requestCode == UGallery.TAKE_PHOTO) {
              Uri uri = UGallery.getSingleImage(data);//返回图像Uri 
          }
      }
      ```

   4. 注意事项

      1. 裁剪图像，使用后记得删除缓存图像

         ```java
          UGallery.deleteTmpImage(context);  
         ```


      2. 只要有裁剪操作requestCode都为*UGallery.CROP_IMAGE*
