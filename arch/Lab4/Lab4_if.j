.class public Lab4_if
.super java/lang/Object

	.method public static main([Ljava/lang/String;)V

	.limit stack 3
	.limit locals 3

	iconst_5
	istore_1
	
	iconst_2
	istore_2

	iload_1
	iload_2
	irem
	ifne equals

	iload_1
	iconst_2
	idiv
	istore_1
	goto End

	equals:
	iinc 1 -1
	goto End

	End:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload_1
	invokevirtual java/io/PrintStream/println(I)V
	return

.end method
