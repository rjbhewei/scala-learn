package com.hewei.contractor


/**
  *
  * @author hewei
  *
  * @date 16/1/6  11:37
  *
  * @version 5.0
  *
  * @desc
  *
  */
object ObjectContractor {
  def main(args: Array[String]) {
    def a = new TestContractor(1, 2)
    def b = new TestContractor()
    println(b.getXx)
    b.setXx(10)
    println(b.getXx)

    While(p = 1 < 2, {
       println("aa"); Thread sleep 1000
    })

  }

  def While(p: => Boolean, s: => Unit) {
    if (p) {
      s
      while (p) s
    }
  }
}