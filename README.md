HanziToPinyin.java来自Android 4.2.2系统源码


## Android HanziToPinyin.java


## 参考：
[汉字 Unicode 编码范围](http://www.qqxiuzi.cn/zh/hanzi-unicode-bianma.php)

[Unicode字符编码—就这么回事](http://blog.csdn.net/u012672456/article/details/44750277#comments)

[利用Android源码，轻松实现汉字转拼音功能](http://blog.coderclock.com/2017/04/04/android/2017-04-04/)



## HanziToPinyin.java来源

[HanziToPinyin.java来自Android 4.2.2系统源码](http://www.grepcode.com/file/repository.grepcode.com/java/ext/com.google.android/android-apps/4.2.2_r1/com/android/providers/contacts/HanziToPinyin.java#HanziToPinyin)

*Ps：从Android4.3开始，HanziToPinyin不再独立使用*

## 使用方式：

```java
ArrayList<HanziToPinyin.Token> list = HanziToPinyin.getInstance().get("我爱祖国");
```
## 使用代码举例:
https://github.com/xiaxveliang/Android_HanziToPinyin_Demo

## 原理

+ UNIHANS数组中，列举汉语拼音A到Z的拼音组成方式不同的字
+ 根据输入的字符，二分查找UNIHANS列表中的对应同音字
+ 输出UNIHANS中找到的对应字符的拼音

## 缺点与不足

**如果在UNIHANS数组中，找不到对应的同音字则无法解析出拼音**
