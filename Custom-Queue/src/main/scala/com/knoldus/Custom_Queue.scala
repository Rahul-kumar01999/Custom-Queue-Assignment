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

import scala.collection.immutable.List

class Custom_Queue[A]{

  //enQueue method for adding element to queue List
  def enQueue (queue : List[A] , element : A) : List[A] = {
    val newQueue =  queue ::: List(element)
    newQueue
  }

  //deQueue method for deleting the first element from the queue List
  def deQueue(queue : List[A] ) : List[A] = {
    queue match {
      case Nil => throw new NoSuchElementException()     // throwing exception for deQueueing an empty queue
      case _ => val newQueue = queue.tail
        newQueue
    }
  }

  //checking if queue is empty or not
  def isEmpty (queue : List[A] ): Boolean = {
    queue match {
      case Nil => true
      case _ => false
    }
  }

}
