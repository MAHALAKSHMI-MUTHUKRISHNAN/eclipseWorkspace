ASSUME CS:CODE
CODE SEGMENT
START:
MOV SI,1200h
MOV DI,1300H
MOV AX,[SI]
MOV BX,[SI+2]
SUB AX,BX
MOV [DI],AX
MOV AH,4CH
INT 21H
CODE ENDS
END START