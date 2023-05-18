
        // Add your code here
        return height(root) - 1;            
    }
    function height(root) {        
        if(root == null) return 0;
        let left = height(root.left);
        let right = height(root.right);
        if(left > right) return (left + 1);
        else return right + 1;
