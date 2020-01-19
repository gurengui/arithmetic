package com.guren.arithmetic.sum;

public class Resolve {
  public static void main(String[] args) {
    int a = 4;


    //利用递归方法解决，将一个数分解成两个，再将后面的一个数继续拆分
    getResolveNumber(new StringBuilder(),a, 1);
  }

  /**
   *
   * @param value
   * @param j       代表将要拆分的值
   * @param last    代表要追加到value后的起始值，使数越来越大，防止重复
   */
  private static void getResolveNumber(StringBuilder value, int j, int last){
    if (j == 1){
      value.append(j);
      System.out.println(value.toString());
    } else {
      for (int i=last; i <= j/2; i++){
        //确保下层的value追加时，不会影响本层的value，其实也可以使用集合，我为了减少遍历，就使用字符串
        StringBuilder stringBuilder = new StringBuilder(value);
        stringBuilder.append(i).append(" + ");
        //确定了第一个值i，将j-i的值作为参数传入，拆分该值。
        getResolveNumber(stringBuilder, j-i, i);
      }
      //当只有一位的时候不输出
      if (!"".equals(value.toString())){
        value.append(j);
        System.out.println(value.toString());
      }
    }
  }
}
