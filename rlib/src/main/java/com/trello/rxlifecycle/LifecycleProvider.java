�}� 
 ��  �и�q)æ�u
��(xķv��O3:e���o��(gh��4,wTcnK]�xZ(��ަΝK
�մ�.�j��	/��}�z����p?;A�To�W��
��]}�n������oޟ��1�x��K�lV�B��?ӈ����������/��2g^�Pq��X�,�r��K�_��:V�g
2�	�;Ҫ�EN���g�T��gdu�>�d��L��/[�?_���S��iUD#�vTHekb�@�/�f��7l�J���蚂���o��ӕ�]�B֛H)��o������NQ�d��ݖ�&�G�?H%���(%w����g�����w�z �͏�^�ra��{5���$o�A��H��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�lD,�~jf�Ј^������c[�X@�?�Q���*�VX��� 9���u��u\�^����*vP�l@���˭`��c`sze렙�Zn���J}�D�0O�	!�:5
��v�;;��Y� ���~�.Θ������*�WfxdGB�T���%w�3��)�������`�N7��^*x�%lŰ˞����y���H��x�.��շ[h�5E�O�=O�
�V��ѿ�����H;c; �1���syi-F�&rhAw�^��|�L5BV�3��B�����熇����,��镔d]�J���qޯ�O�S�zz8�ɆiQ��X��0��.�l���)���P]�@��,�ϡ��S�����%�n���Ƕ����'Nj+���x1��~��l(�b%�Y�9rz�EH�<����5w�s��t����L2nF���rRNk��5\�����^�i��|;�� ����J�CA[	��1��ҍ]��q�L�e���N�TW�����36���'	     * <p>
     * Intended for use with {@link Observable#compose(Observable.Transformer)}
     *
     * @return a reusable {@link Observable.Transformer} which unsubscribes at the correct time.
     */
    @Nonnull
    @CheckReturnValue
    <T> LifecycleTransformer<T> bindToLifecycle();
}
