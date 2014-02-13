; Micah Stringham
; Strmic29

.class public LeapYear
    .super java/lang/Object
    
    .method public <init>()V
        aload_0
        invokespecial java/lang/Object/<init>()V
        return
    .end method
    
.method public static main([Ljava/lang/String;)V

    .limit statck 4
    .limit locals 1
    
    getstatic java/lang/System/out Ljava/io/PrintStream;

    bipush 2012
    bipush 1980
    isub
    bipush 4
    idiv

    invokevirtual java/io/PrintStream/println(I)V 
    return   
.end method