// Implementing Insertion Sort

for (let i = 0; i < n; i++) {
    let j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
        let temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        j--;
    }
}

/*  Time Complexity
        Best Case = O(n)
        Worst Case & Average Case = O(n^2)
*/