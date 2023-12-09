/**
 * @param {string} val
 * @return {Object}
 */
function expect(val) {
  function toBe(value) {
    if (val !== value) {
      throw new Error("Not Equal");
    }
    return true;
  }

  function notToBe(value) {
    if (val === value) {
      throw new Error("Equal");
    }
    return true;
  }

  return { toBe: toBe, notToBe: notToBe };
}




 

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */