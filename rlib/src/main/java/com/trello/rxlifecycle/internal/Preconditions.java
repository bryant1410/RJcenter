�}C� 
 ��  �ԫC�8"&��u
��Lxė�>-�O/�}��a�:�Y���,�DxR�7�$����&�oT�9�Md�f�}����=�ݬ�6��%��21���~���<�a�
�]�<m3��`���hX����d�$�李��c���_�������Ha��DNd+�Ȳن��B'��������)!{	���������~�J��8N�4%������+0b��QJ*<>:��78ZYt�%�|xűs)*5o�n.���b�_� �m�IN�4��R3׎`01�+�ȋ`,�&����EGi\�/���������nr�#��U`�N��l�^��6�L�ɚ�j������O��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�ions and
 * limitations under the License.
 */

package com.trello.rxlifecycle.internal;

public final class Preconditions {
    public static <T> T checkNotNull(T value, String message) {
        if (value == null) {
            throw new NullPointerException(message);
        }
        return value;
    }

    private Preconditions() {
        throw new AssertionError("No instances.");
    }
}
