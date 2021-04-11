int maxValue = arr[0];
for(int i = 1; i < arr.length; i++) {
  if(maxValue < arr[i]) {
  	maxValue = arr[i];
  }
}

System.out.print(maxValue);