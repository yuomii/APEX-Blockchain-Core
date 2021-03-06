/*
 * Copyright  2018 APEX Technologies.Co.Ltd. All rights reserved.
 *
 * FileName: MerkleTreeTest.scala
 *
 * @author: shan.huang@chinapex.com: 2018-08-09 下午1:06@version: 1.0
 */

package com.apex.test

import com.apex.crypto.{BinaryData, UInt256, MerkleTree}
import org.junit.Test

@Test
class MerkleTreeTest {   

  @Test
  def testMerkleTree = {

    val h1 = new UInt256(BinaryData("6b51f4b3bc2ca9611f91e58fb2960ccec30b70b6f1f8da59a67af5c04bf215a8"))
    val h2 = new UInt256(BinaryData("d1f38fd2017f6c536a689db5736d775fe312717aef87993b87cbb6f8364d779e"))
    val h3 = new UInt256(BinaryData("5f7d106852d44d4b842cd034c0ce4b47e5ab3752d79b012306bb16df4131b4c5"))
    val h4 = new UInt256(BinaryData("ca3d02f7d8bb600c5fcaa107d2587b5c527f9b3a97d90328ee633d3d25680931"))
    val h5 = new UInt256(BinaryData("3a77b92e05391baa0defc5993a2eb44c2b5627ac780c3bc67a4a58421a0e1f05"))

    assert(MerkleTree.root(Seq[UInt256](h1)).toString == "6b51f4b3bc2ca9611f91e58fb2960ccec30b70b6f1f8da59a67af5c04bf215a8")
    assert(MerkleTree.root(Seq[UInt256](h1, h2)).toString == "06267b944009f5c0fe39e3d4d6bd646b2130ce430e5a979cd02fa193b477efb1")
    assert(MerkleTree.root(Seq[UInt256](h1, h2, h3)).toString == "2cfe3fa489e89ce5c4b64bcc27a5b41cd2f23b940c8238cad963477c28f3fb98")
    assert(MerkleTree.root(Seq[UInt256](h1, h2, h3, h4)).toString == "c2237cc814f33840f0d900293539ae5aa7f1526155de4d05642c1f4a16572a06")
    assert(MerkleTree.root(Seq[UInt256](h1, h2, h3, h4, h5)).toString == "a8e16367797f4a27275dd69607819764685890b8ec1ebec7a06303f5e6693a4c")

  }
  
}
