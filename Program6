
include <stdio.h>
#include<math.h>
#define pi 3.14159
int main()
{
    int r,h,ch;
    float A,V;
    do
    {
        printf("\n1.CYLINDER\n2.CONE\n3.SPHERE\n4.EXIT\n Select the number:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
          printf  ("Enter the radius and height of the cylinder respectively:\n");
            scanf("%d%d",&r,&h);
            A=2*pi*r*h+2*pi*r*r;
            V=pi*r*r*h;
            break;
            case 2:
              printf  ("Enter the radius and height of the cone respectively:\n");
            scanf("%d%d",&r,&h);
            A=pi*r*(r+pow((h*h+r*r),0.5));
            V=pi*r*r*h/3;
            break;
            
printf  ("Enter the radius of sphere respectively:\n");
            scanf("%d",&r);
            A=4*pi*r*r;
            V=4/3*pi*r*r*r;
            break;
            default:if(ch!=4)
            {
            printf("Enter valid option");
        }
        while(ch!=4)
        return 0;
        }
    }
}
