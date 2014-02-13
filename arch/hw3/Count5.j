; Micah Stringham
; Strmic29

.class public Count5
    .super java/lang/Object
    
    .method public <init>()V
        aload_0
        invokespecial java/lang/Object/<init>()V
        return
    .end method
    
.method public static main([Ljava/lang/String;)V

    .limit stack 4
    .limit locals 1
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 1
    invokevirtual java/io/PrintStream/println(I)V 
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 2
    invokevirtual java/io/PrintStream/println(I)V 
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 3
    invokevirtual java/io/PrintStream/println(I)V 
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 4
    invokevirtual java/io/PrintStream/println(I)V 
    
    getstatic java/lang/System/out Ljava/io/PrintStream;
    bipush 5
    invokevirtual java/io/PrintStream/println(I)V 
    
    return
.end method