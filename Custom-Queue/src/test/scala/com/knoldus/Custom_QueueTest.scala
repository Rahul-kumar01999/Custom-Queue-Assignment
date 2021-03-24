// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus
//scalastyle:off magic.number
import org.scalatest.flatspec.AnyFlatSpec



class Custom_QueueTest extends AnyFlatSpec {

  "Custom_Queue" should "return true if queue is empty" in{
    val queue = new Custom_Queue[String]
    val result=queue.isEmpty(List())
    assertResult(true)(result)
  }
  it should "return enQueued value only because List was empty initially" in {
    val queue = new Custom_Queue[String]
    val result = queue.enQueue(List(), "knoldus")
    assertResult(List("knoldus"))(result)
  }
  it should "return enQueued list of string after adding element" in {
    val queue = new Custom_Queue[String]
    val result = queue.enQueue(List("knoldus"), "Hi")
    assertResult(List("knoldus", "Hi"))(result)
  }
  it should "return deQueued list of string after deleting head element " in{
    val queue = new Custom_Queue[String]
    val result = queue.deQueue(List("knoldus","Hi"))
    assertResult(List("Hi"))(result)
  }
  it should " throw NoSuchElementException!! if we try to delete element from an empty queue" in{
    val queue = new Custom_Queue[Int]
    assertThrows[NoSuchElementException]{
      queue.deQueue(List())
    }
  }
  it should "return enQueued list of int after adding element " in{
    val queue = new Custom_Queue[Int]
    val result = queue.enQueue(List(1,2),3)
    assertResult(List(1, 2, 3))(result)
  }
  it should "return deQueued list of int after deleting head element" in{
    val queue = new Custom_Queue[Int]
    val result=queue.deQueue(List(1,2,3))
    assertResult(List(2, 3))(result)
  }

  it should "return false if queue is not empty" in{
    val queue = new Custom_Queue[Int]
    val result=queue.isEmpty(List(1,2,3,4))
    assertResult(false)(result)
  }
}