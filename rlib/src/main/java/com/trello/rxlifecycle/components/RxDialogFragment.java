�}$� 
 ��  Db�k�B3<��u
��� x�O��M&N3�驻�6-��/��� v��K���e�L$�Q�V)*�A�B�̸S�Qj�a�C_;�y������a�GJ]���O�c���/�j*0K
�c�]�.��t�����F��JMP1:c� �@�aK���S{ ̴DI'!	���%�Fwy����g{��kR�'T������jQЬ�1�� N^V�K�~�ց���|�4������8�*����!�7�ĭp�˒ifl7��@L���j��-W�i	x:ȣ��EҒ��������6[���?�{ޮ����I��(��Ўج���&=�ZA��g�����w�z �͏�^�ra��{5���$o�A��H��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�l�)v�⬘|C+9�����~n��q���vL�:�된��Uڴi`��Nq4�y�|�7b���~�q���26~��c��;<�=�7&Y�l�v�&TTm��K
?|u����4~�4g�y�ۿ D2� �Zj\t�a0z5�&����Y,�L�I�lfx��>�����!���t�i��p?q?y��=!I:����X��wɕs_R��l~���M��(��g���0)�)�A��}��{��,�ف���y�����eK㔮�F01�o�a2����Z�����ͯ���sA�
��n���z�aw��),?�fs'Iz/�x�e��L �eY�#���dՍrv���[3�C�j�P��{�4~(��Gzϲg�/��#����<��s20�"�RYX�k�#�o}�gbk&��X>�-?:} ��v?o1B:���|@�[���@�O�mʡ�� XؤC���?� W4�/��w�'7�Z/������������@!ۻfO �2)!�XCJ>D��(?�kf\l�&^��G�FX��{�XT�_�DU$�7j�91J��K��eۮ�ے�uݹ������R�M�3��bE����eQ__�M�֚��E{�(�����2��5>�:�|?3�̤v��lxq�D��m�w�z���|5׳�K��au����%N��*�/��A��[���6bh%"��M�71JXC����E��i����>՞zM�ci5��� ��2���x��w3SLR�t�Ll�t@EV��:�4�S���x�u� �o+"�µ��J�F	;	��-�k��	�����CK�Kޢ�[d�tj��Wmg*w6�پ9v�/��j�:��,HS;BfQ{i��n�pF∢�>ߝ7�&ς�M��9O��],R�PH|	Gw���KF��ܐs�[aK"����L)y��U����2��@*?���I��ֿ_��(�EXFoL:�0���Ya]���Ne���n�(?7���zr���G��,馰HQfQ�h�������,��o��}��J9�k��ql�&^��F�FX��	}�X�K��D�/l�_C@��c��|�J-�-&��B�����K�g|�]��t)-k�/A�����dF>̦�!�̞�뭖��z~���.6
��\�&ZYw��u��69炈�p�����V�2��Q	u��w���BfrJ��[��&�$bot����%^GFX#���R�]��E��1��(ב|E�Lt%���}��(��W�5�#;�b�R'7�@CEa��Q�qY�X�䥒x�T�3�T78�b���N�}�^b\���k��E�����Pw�M����Yg��umi#<9���vQ������vRBWLQ&>C��n�C|䈢�8չI�g��~��U
��=S��w,R�
\Rs@Mj@���JE�ޗ�}�?Sv��@��T<r��L���@�} ��v?o1B:���|@�[���@�O�mʡ�� XؤC���?� W4�/��w�'7�Z/������������@!ۻfO �2)!�XCJ>D��(?�kf\l '4���	~��#�Z���������K��[j�.��#��G)Q�W�`���tg;)߳��y�=���+,� (�{{�m��;E����k��'�{��aS0?j�J���+uAc^�6Bړ��u��*َ���*-۷~y�4�{AR��Oc�K}����"Rw��(��X*ʊ%��[vݠ�~�<F��di��*' j�щ�*A;�=�ۊ�9��SZk@��a�E�6����Q��(��ιW���o���}5 ٱ���v�kJ7^ӄu	L���eJ�á0IAB��y�)�uIG������5AR��k�f�p� 3��p�E�x���v9��؊�~��AEFe�1��p%�Jf_L�R�c$T_�J�5��	�6N�����(q�����#�mL4ׯi��g�P��rfu\��A��?(���x��`2J)��/�I��O�/gJ�e�[�}�Je�^Ge;�n$��h�P���Sɱ�������]�W��099�eW=�� @CallSuper
    public void onDestroyView() {
        lifecycleSubject.onNext(FragmentEvent.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override
    @CallSuper
    public void onDestroy() {
        lifecycleSubject.onNext(FragmentEvent.DESTROY);
        super.onDestroy();
    }

    @Override
    @CallSuper
    public void onDetach() {
        lifecycleSubject.onNext(FragmentEvent.DETACH);
        super.onDetach();
    }
}
