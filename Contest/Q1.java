// int n=sc.nextInt();
//             List<Integer> a=new ArrayList<>();
//             int maxOdd=Integer.MIN_VALUE;
//             int odd=0;
//             for (int i = 0; i < n; i++) 
//             {
//                 int x=sc.nextInt();
//                 if((x&1)==1)
//                 {
//                     odd++;
//                     maxOdd=Math.max(maxOdd,x);
//                 }
//                 else{
//                     a.add(x);
//                 }
//             }
//             if(odd==0||odd==n)
//             {
//                 System.out.println(0);
//                 continue;
//             }
//             int steps=0;
//             for(int i=0;i<a.size();i++)
//             {
//                 if(a.get(i)>maxOdd)
//                 break;
//                 else{
//                     steps++;
//                     i--;
//                 }
//             }
//             Collections.sort(a);
//             inner:
//             for (int i = 0; i < a.size(); i++) 
//             {
//                 if(odd==n)
//                 break;
//                 if( (a.get(i)&1)==1 )
//                 continue inner;

//                 int sum=a.get(i)+maxOdd;
//                 steps++;
//                 if(a.get(i)<maxOdd)
//                 {
//                     maxOdd=Math.max(maxOdd, sum);
//                     odd++;
//                     a.set(i, sum);
//                 }
//                 else
//                 {
//                     maxOdd=sum;
//                     i--;
//                 }
//             }
//             System.out.println(steps);