assume cs:code,ds:data
data segment
m1 db 05h,00h,02h,06h
m2 db 05h,00h,02h,06h
result db 04 dup(0)
data ends
code segment
start:
mov ax,data
mov ds,ax
mov cl,04h
mov si,offset m1
mov di,offset m2
mov bx,offset result
dloop:
mov al,[si]
add al,[di]
mov [bx],al
inc si
inc di
inc bx
dec cl
jnz dloop
int 21h
code ends
end start

