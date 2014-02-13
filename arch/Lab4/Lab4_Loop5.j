  .class public Lab4_Loop5
      .super java/lang/Object

     
     
     

      .method public static main([Ljava/lang/String;)V
        .limit stack 3
	.limit locals 3 
 
	iconst_0
	istore_1
	iconst_5
	istore_2
Loop:
	iload_1
	iload_2
	isub
	iinc 1 1
	ifne Loop

LoopEnd:
	
	return
      .end method
