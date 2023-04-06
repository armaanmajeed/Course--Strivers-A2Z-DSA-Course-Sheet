// Implementing Selection Sort

for (let i = 0; i < n - 1; i++) {
    let min = i;
    for (let j = i; j < n; j++) {
        if (arr[j] < arr[min]) {
            min = j;
        }
    }
    let temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
}

/*  Time Complexity
        Best Case, Worst Case & Average Case = O(n^2)
*/