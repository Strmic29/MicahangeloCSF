;creates class
 
.class public Lab3A
      .super java/lang/Object

      .method public <init>()V
         aload_0
         invokespecial java/lang/Object/<init>()V
         return
      .end method



.method public static main([Ljava/lang/String;)V
    
     .limit stack 2
    .limit locals 1

      

    getstatic java/lang/System/out Ljava/io/PrintStream;

     bipush 8
    bipush 5
    ior

      invokevirtual java/io/PrintStream/println(I)V 

.end method