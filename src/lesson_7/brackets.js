// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(S) {

    var S = S.split("");

    var stack = [];

    for (var i = 0; i < S.length; i++) {

        var c = S[i];

        if (c == '{' || c == '[' || c == '('){

            stack.push(c);

        } else if (c == '}' || c == ')' || c == ']'){

            var t = stack.pop() + c;

            if (t != "{}" && t != "[]" && t != "()") {

                return 0;

            }

        } else {
            return 0;
        }

    }

    if (stack.length > 0) {

        return 0;

    }

    return 1;

}
