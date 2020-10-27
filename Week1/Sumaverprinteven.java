#include<stdio.h>
float sumaver(int p[2])
{int sum;
float avg;
sum=p[1]+p[0];
avg=(p[1]+p[0])/2;
printf("%d\n",sum);
return avg;
}
void printeven(int p[2])
{int s,b,n;
if(p[0]>p[1])
{s=p[1];b=p[0];}
else
{s=p[0];b=p[1];}
if(s%2!=0)
{s=s-1;}
for(n=s+2;n<b;n=n+2)
{printf("%d\n",n);}

}
int main()
{int a,b,c,p[2];
float avg;
printf("Enter three numbers:\n");
scanf("%d%d%d,"&a,&b,&c);
if(a>=c&&b>=c)
{p[0]=a;p[1]=b;}
else
if(b>=a&&c>=a)
{p[0]=b;p[1]=c;}
else 
if(a>=b&&c>=b)
{p[0]=a;p[1]=c;}
avg=sumaver(p);
printeven(p);
return 0 ;
}
