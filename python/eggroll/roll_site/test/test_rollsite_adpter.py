#
#  Copyright 2019 The Eggroll Authors. All Rights Reserved.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
#

from eggroll.core.io.rollsite_adapter import RollsiteAdapter

if __name__ == '__main__':
    a = range(10)
    input_iterator = enumerate(a)
                                                         
    #_tagged_key = self.__remote__object_key(job_id, name, tag, src_role, src_party_id, dst_role,
    #                                                    dst_party_id, dst_host, dst_port)
    _tagged_key = 'atest-model_A-Hello-guest-10001-host-10002-localhost-9394'
           
    output_adapter = RollsiteAdapter(options={'name': _tagged_key})
     
    output_writebatch = output_adapter.new_batch()

    for k, v in input_iterator:
        print("k:", k, "v:", v)
        output_writebatch.put(k.to_bytes(length=4, byteorder='big', signed=False), v.to_bytes(length=4, byteorder='big', signed=False))
      
    output_writebatch.close()
    output_adapter.close()
