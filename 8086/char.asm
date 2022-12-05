assume cs:code,ds:data
data segment
string1 db "MAHALAKSHMI"
out1 db "Found$"
out2 db "Not Found$"
data ends
code segment
start:mov ax,data
      mov ds,ax
      mov es,ax
      mov di,offset string1
      mov ah,01h
      int 21h
      mov cx,11h
      cld
repne scasb
      jz L1
      mov dx,offset out2
      jmp L3
   L1:mov dx,offset out1
   L3:mov ah,09h
      int 21h
      mov ah,4ch
      int 21h
code ends
end start
   